package com.ryan.commons.config.cache;

import java.util.ArrayList;
import java.util.List;


public class CacheHelper {

	private static List<CacheSetProperties> cacheSetPropertiesList = new ArrayList<CacheSetProperties>();
	
	public static void addProperties(CacheSetProperties cacheSetProperties){
		cacheSetPropertiesList.add(cacheSetProperties);
	}

	public static List<CacheSetProperties> getCacheSetPropertiesList() {
		return cacheSetPropertiesList;
	}

	public static void setCacheSetPropertiesList(List<CacheSetProperties> cacheSetPropertiesList) {
		CacheHelper.cacheSetPropertiesList = cacheSetPropertiesList;
	}
	
}
