package cjx.manager.serviceImpl;

import cjx.manager.dao.TypeDao;
import cjx.manager.entity.Type;
import cjx.manager.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ${DESCRIBE}
 *
 * @author chenjunxu
 * @date 2017/11/8
 */
@Service
public class TypeServiceImpl implements TypeService {

	private final TypeDao typeDao;

	@Autowired
	public TypeServiceImpl(TypeDao typeDao) {
		this.typeDao = typeDao;
	}

	@Override
	public Type get(Integer id) {
		return typeDao.selectByPrimaryKey(id);
	}

	@Override
	public List<Type> getAll() {
		return typeDao.selectAll();
	}

	@Override
	public int insert(Type type) {
		return typeDao.insert(type);
	}

	@Override
	public int update(Type type) {
		return typeDao.updateByPrimaryKey(type);
	}

	@Override
	public int delete(Integer id) {
		return typeDao.deleteByPrimaryKey(id);
	}
}
