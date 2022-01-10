package kr.co.vida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.vida.dao.Dao;
import kr.co.vida.dto.CouponBoxDTO;
import kr.co.vida.dto.CrewPointsDTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("CouponBoxService")
public class CouponBoxImple implements VidaService<CouponBoxDTO> {
	
	@Autowired
	Dao<CouponBoxDTO> dao;

	public void setDao(Dao<CouponBoxDTO> dao) {
		this.dao = dao;
	}

	@Override
	public List<CouponBoxDTO> selectAllList() {
		return null;
	}

	@Override
	public CouponBoxDTO selectOne(int no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertOne(CouponBoxDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateOne(CouponBoxDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dropOne(int no) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CrewPointsDTO> selectAllList(int no) {
		return dao.getListAll(no);
	}

}
