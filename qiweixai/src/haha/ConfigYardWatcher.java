package haha;

import java.util.List;

import org.I0Itec.zkclient.IZkChildListener;
import org.I0Itec.zkclient.IZkDataListener;
import org.I0Itec.zkclient.ZkClient;

public class ConfigYardWatcher {
	
	private ZkClient client;
	
	private ConfigYardListener configYardListener;
	
	private ConfigYard configYard;
 
	public ConfigYardWatcher(ZkClient client,ConfigYard configYard) {
		this.client = client;
		this.configYard = configYard;
		this.initConfigYard();
	}
	
	private void initConfigYard(){
		configYardListener = new ConfigYardListener();
	}  
	
	public void watcher(String key){
		client.subscribeDataChanges(key, configYardListener);
		client.subscribeChildChanges(key, configYardListener);
	}
 
	/**
	 * 配置监听器
	 * @author flyking
	 *
	 */
	private class ConfigYardListener implements IZkDataListener,IZkChildListener{
		public void handleDataChange(String dataPath, Object data)
				throws Exception {
			//logger.info("data {} change,start reload configProperties",dataPath);
			configYard.reload();
		}
 
		public void handleDataDeleted(String dataPath) throws Exception {
			//logger.info("data {} delete,start reload configProperties",dataPath);
			configYard.reload();
		}

		@Override
		public void handleChildChange(String arg0, List<String> arg1) throws Exception {
			// TODO Auto-generated method stub
			
		}
		
	}

}
