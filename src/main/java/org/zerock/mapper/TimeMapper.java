package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	// ; 없어야 한다
	@Select("Select sysdate from dual")
	public String getTime();
	
	public String getTime2();
	
	
	
}
