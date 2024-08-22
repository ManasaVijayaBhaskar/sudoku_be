//package com.iqquestor.sudoku.converter;
//
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import jakarta.persistence.AttributeConverter;
//import jakarta.persistence.Converter;
//
//import java.io.IOException;
//import java.util.Map;
//
//@Converter
//public class MapToJsonConverter implements AttributeConverter<Map<Integer, Integer>, String> {
//
//    private static final ObjectMapper objectMapper = new ObjectMapper();
//
//    @Override
//    public String convertToDatabaseColumn(Map<Integer, Integer> attribute) {
//        try {
//            return objectMapper.writeValueAsString(attribute);
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException("Error converting map to JSON", e);
//        }
//    }
//
//    @Override
//    public Map<Integer, Integer> convertToEntityAttribute(String dbData) {
//        try {
//            return objectMapper.readValue(dbData, Map.class);
//        } catch (IOException e) {
//            throw new RuntimeException("Error converting JSON to map", e);
//        }
//    }
//}
