package br.com.netshoes.spark.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonUtils {

	public static <T> T asObject(String json, Class<T> clazz) {
		Gson gson = new Gson();
		return gson.fromJson(json, clazz);
	}

	public static <T> String asJson(T object, String versao) {
		final double versaoFinal = Double.parseDouble(versao);
		final Gson gson = new GsonBuilder().setVersion(versaoFinal).create();
		return gson.toJson(object);
	}
}
