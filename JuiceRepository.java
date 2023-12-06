package com.xworkz.Repository.app;

public interface JuiceRepository {
 int TOTAL_ITEMS=10;
void validation(String name);
 default boolean IsExist(String name)
 {
 return true;
}


}
