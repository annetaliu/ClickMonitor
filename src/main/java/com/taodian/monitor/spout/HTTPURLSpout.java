package com.taodian.monitor.spout;

import com.taodian.monitor.storm.DataCell;
import com.taodian.monitor.storm.DataSpout;
import com.taodian.monitor.storm.TopologyContext;

public class HTTPURLSpout implements DataSpout {
	
	public HTTPURLSpout(){
		
	}
	
	public boolean connect(String url){
		
		return false;
	}
	
	@Override
	public DataCell nextDataCell() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void prepare(TopologyContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isClosed() {
		// TODO Auto-generated method stub
		return false;
	}




}
