package cn.xyzs.common.util;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

import cn.xyzs.common.map.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class XySqlUtil {
	@Autowired
	private BaseMapper baseMapper;
	
	private static XySqlUtil sqlUtil;


	@PostConstruct
	public void init() {
		sqlUtil = this;
		sqlUtil.baseMapper = this.baseMapper; 
	}



	public static List<LinkedHashMap<String, Object>> createSql(String sql,Map<String, Object> map) throws Exception{
		Set<String> keys = map.keySet();
		StringBuffer sb = new StringBuffer(sql.trim());
		Iterator<String> iterator = keys.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			String value = map.get(key).toString();
			if(value.indexOf("--")>=0){
				throw new Exception("生成sql异常,有sql注入风险");
			}
			int index = sb.indexOf("#{"+key+"}");
			if(index>0){
				sb.replace(index, index+key.length()+3,"'"+map.get(key).toString()+"'");
			}
		}
		return sqlUtil.baseMapper.superManagerSelect(sb.toString());
	}

}
