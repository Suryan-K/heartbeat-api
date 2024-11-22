package com.tanjer.heartbeat.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.tanjer.heartbeat.model.ApiLog;

@Mapper
public interface ApiLogMapper {

    void insertApiLog(ApiLog apiLog);
}