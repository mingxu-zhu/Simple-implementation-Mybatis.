package com.xu.mybatis.sqlsession;

public interface SqlSession {
    <T> T getMapper(Class<T> daoInterfaceClass);
    void close();
}
