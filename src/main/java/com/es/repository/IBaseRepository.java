package com.es.repository;

import com.es.qo.PageResult;
import com.es.qo.QueryObject;
import org.elasticsearch.client.RestClient;

import java.util.List;
/**
 * 封装通用的操作ES方法
 * @param <T>
 */
public interface IBaseRepository<T> {

    /**
     * 关闭连接
     */
    void close() throws Exception;

    /**
     * 获取低水平客户端
     * @return
     */
    RestClient getLowLevelClient();

    /**
     * 新增和修改数据
     */
    void insertOrUpdate(T t) throws Exception;

    /**
     * 删除数据
     */
    void delete(Long id) throws Exception;

    /**
     *通过文档id获取数据
     */
    T get(Long id) throws Exception;

    /**
     * 获取所有文档
     */
    List<T> getAll() throws Exception;

    /**
     * 搜索
     */
    PageResult<T> search(QueryObject qo) throws Exception;

}
