package com.fatalitiii.adventureplus.Utils;

import com.fatalitiii.utilfatal.Register.BlockRegister;
import com.fatalitiii.utilfatal.Register.ItemRegister;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void init(){
	}
	
	@Override
	public void registerRenders() {
		BlockRegister.registerRenders(ModInfo.MOD_ID);
		ItemRegister.registerRenders(ModInfo.MOD_ID);
	}

}
