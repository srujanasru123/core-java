package com.xworkz.app.repository;

import com.xworkz.app.dto1.EngineerDTO;

public interface EngineerDTORepository {
int TOTAL_ITEMS = 5;
void  save(EngineerDTO dto) ;
default boolean IsExist(EngineerDTO dto) {
	return false;
}


}



