package cjx.manager.service;

import java.util.List;

/**
 * ${DESCRIBE}
 *
 * @author chenjunxu
 * @date 2017/11/8
 */
public interface BaseService<T> {

	T get(Integer id);

	List<T> getAll();

	int insert(T t);

	int update(T t);

	int delete(Integer id);

}
