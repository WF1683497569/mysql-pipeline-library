package org.devops

import groovy.sql.Sql
@Grab('mysql:mysql-connector-java:8.0.23')
@GrabConfig(systemClassLoader=true)

/**
 * @author fwei* @date 2021/1/25 17:38
 * @version 1.0
 */
//封装HTTP请求
def GetMySQLInstance(String url, String user, String password){
    return Sql.newInstance(url, user, password, 'com.mysql.cj.jdbc.Driver')
}