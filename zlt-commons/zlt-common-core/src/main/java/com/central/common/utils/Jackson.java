package com.central.common.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;


public  class Jackson {
	private static ObjectMapper objectMapper = new ObjectMapper();

	public static String toString(Object value) {
		try {
			return objectMapper.writeValueAsString(value);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return "";
		}
	}
	public static byte[] toBytes(Object value) {
		try {
			return objectMapper.writeValueAsBytes(value);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return new byte[]{};
		}
	}
	public static String writeValueAsString(Object value) {
		try {
			return objectMapper.writeValueAsString(value);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return "";
		}
	}
	public static byte[] writeValueAsBytes(Object value) {
		try {
			return objectMapper.writeValueAsBytes(value);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return new byte[]{};
		}
	}


	public static <T> T readValue(String content, Class<T> valueType) {
		try {
			return objectMapper.readValue(content, valueType);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static <T> T readValue(String content, TypeReference<T> valueTypeRef) {
		try {
			return objectMapper.readValue(content, valueTypeRef);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static <T> T readValue(InputStream src, Class<T> valueType) {
		try {
			return objectMapper.readValue(src, valueType);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static <T> T convertValue(Object fromValue, Class<T> toValueType) {
		return objectMapper.convertValue(fromValue, toValueType);
	}


}
