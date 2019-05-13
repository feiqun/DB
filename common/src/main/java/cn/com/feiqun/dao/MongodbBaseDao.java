package cn.com.feiqun.dao;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * @author feiqun
 * @date 2019/5/13 14:59
 * @desc
 */
public interface MongodbBaseDao<T, ID> {

    <S extends T> S save(S entity);

    <S extends T> List<S> saveAll(Iterable<S> entites);

    Optional<T> findById(ID id);

    boolean existsById(ID id);

    List<T> findAll();

    Iterable<T> findAllById(Iterable<ID> ids);

    long count();

    void deleteById(ID id);

    void delete(T entity);

    void deleteAll(Iterable<? extends T> entities);

    void deleteAll();

    List<T> findAll(Sort sort);

    Page<T> findAll(Pageable pageable);

    <S extends T> S insert(S entity);

    <S extends T> List<S> insert(Iterable<S> entities);

    <S extends T> Optional<S> findOne(Example<S> example);

    <S extends T> List<S> findAll(Example<S> example);

    <S extends T> List<S> findAll(Example<S> example, Sort sort);

    <S extends T> Page<S> findAll(Example<S> example, Pageable pageable);

    <S extends T> long count(Example<S> example);

    <S extends T> boolean exists(Example<S> example);
}
