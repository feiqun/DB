package cn.com.feiqun.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author feiqun
 * @date 2019/4/29 17:12
 * @desc
 */
public class MongodbBaseDaoImpl<T, ID> implements MongodbBaseDao<T, ID> {

    @Autowired
    MongoRepository<T, ID> mongoRepository;

    @Override
    public <S extends T> S save(S entity) {
        return mongoRepository.save(entity);
    }

    @Override
    public <S extends T> List<S> saveAll(Iterable<S> entites) {
        return mongoRepository.saveAll(entites);
    }

    @Override
    public Optional<T> findById(ID id) {
        return mongoRepository.findById(id);
    }

    @Override
    public boolean existsById(ID id) {
        return mongoRepository.existsById(id);
    }

    @Override
    public List<T> findAll() {
        return mongoRepository.findAll();
    }

    @Override
    public Iterable<T> findAllById(Iterable<ID> ids) {
        return mongoRepository.findAllById(ids);
    }

    @Override
    public long count() {
        return mongoRepository.count();
    }

    @Override
    public void deleteById(ID id) {
        mongoRepository.deleteById(id);
    }

    @Override
    public void delete(T entity) {
        mongoRepository.delete(entity);
    }

    @Override
    public void deleteAll(Iterable<? extends T> entities) {
        mongoRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        mongoRepository.deleteAll();
    }

    @Override
    public List<T> findAll(Sort sort) {
        return mongoRepository.findAll(sort);
    }

    @Override
    public Page<T> findAll(Pageable pageable) {
        return mongoRepository.findAll(pageable);
    }

    @Override
    public <S extends T> S insert(S entity) {
        return mongoRepository.insert(entity);
    }

    @Override
    public <S extends T> List<S> insert(Iterable<S> entities) {
        return mongoRepository.insert(entities);
    }

    @Override
    public <S extends T> Optional<S> findOne(Example<S> example) {
        return mongoRepository.findOne(example);
    }

    @Override
    public <S extends T> List<S> findAll(Example<S> example) {
        return mongoRepository.findAll(example);
    }

    @Override
    public <S extends T> List<S> findAll(Example<S> example, Sort sort) {
        return mongoRepository.findAll(example, sort);
    }

    @Override
    public <S extends T> Page<S> findAll(Example<S> example, Pageable pageable) {
        return mongoRepository.findAll(example, pageable);
    }

    @Override
    public <S extends T> long count(Example<S> example) {
        return mongoRepository.count(example);
    }

    @Override
    public <S extends T> boolean exists(Example<S> example) {
        return mongoRepository.exists(example);
    }
}
