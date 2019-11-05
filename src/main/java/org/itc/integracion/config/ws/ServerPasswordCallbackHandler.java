/*
 * MIT License 
 * 
 * Copyright (c) 2018 Ownk
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 */

package org.itc.integracion.config.ws;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;
import org.itc.integracion.util.BeanUtil;
import org.itc.integracion.util.Crypto;
import org.springframework.core.env.Environment;
/**
 *
 * <h1>ServerPasswordCallbackHandler</h1>
 *
 * Description
 *
 * @author THEOVERLORDKOTAN (ADA) 
 * @version 1.0
 * 
 */
public class ServerPasswordCallbackHandler implements CallbackHandler {
	
	private Environment valueEnviroment = null;
	
	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];

		valueEnviroment = BeanUtil.getBean(Environment.class);

		String valueUserPro =  valueEnviroment.getProperty("fagra.wss.usernametoken.user");
		String valuePassPro =valueEnviroment.getProperty("fagra.wss.usernametoken.password");
		String valueUser = Crypto.desencriptar(valueUserPro);
		String valuePass = Crypto.desencriptar(valuePassPro);
		if (valueUser.equals(pc.getIdentifier())) {
			
			pc.setPassword(valuePass);
			System.out.println("pc.getPassword() " + pc.getPassword());
		}
	}
	
	public static void main(String[] args) {
		String valuePass = Crypto.desencriptar("CRYPTO://KKHBGDF75L8JH7FJH6K0I3GFCC89IHCIJIK9HGK68FC1E7844219L6C8BZBBJ5691IHK5H231G54FC1L2E6A76JK3165C4A51040BB3LBA4B3KH9GK9Z14B23J0GG5ID0J4FA013F5E5D0IB0JCECC1A92B5LJBJ2CKD05L7C9029HZBBJ5691IHK5H231G54FC1L2E6A76JK3165C4A51040BB3LBA4B3KH9GK9Z16C7BA9HI19EBCEHFGD0J1IDFIBC5LHJBJIF95DAEJ8H3A87HEKL21GE69Z15EL568E64L9KID5DCF59373CEA2II33HJ32B9F40FF8AAG3F2F80AGF14ZKKHBGDF75L8JH7FJH6K0I3GFCC89IHCIJIK9HGK68FC1E7844219L6C8BZ15EL568E64L9KID5DCF59373CEA2II33HJ32B9F40FF8AAG3F2F80AGF14ZBBJ5691IHK5H231G54FC1L2E6A76JK3165C4A51040BB3LBA4B3KH9GK9Z16K1J8AFFIL3D0JBH02LG8064ECJE56FJBEH7D2L19BC5JGG7EF40KI2C1ZBBJ5691IHK5H231G54FC1L2E6A76JK3165C4A51040BB3LBA4B3KH9GK9Z16C7BA9HI19EBCEHFGD0J1IDFIBC5LHJBJIF95DAEJ8H3A87HEKL21GE69Z6CAJCHL13HHGC996JF71C6521K6KK2FB05B540J82A7FAI7022KK6ACF9Z10250A725DK9KIKL91D297F3158DBF353EADBKHDA3G37CKIH43B5F827KZL58K6KE59AKAKK3C867JCGJ0BK6I1L551EAF1B6FJGA7EI322E6DG0L1JZDI88JLJDCFD22J0CFKAHFG8H681608J13JE31141KC13J6GK1LE51LFCFZ100EDA019JHBE82D41010C0AL7L70JLIA7G923CKDIEL8H7A8H1JEF71EAZ6CAJCHL13HHGC996JF71C6521K6KK2FB05B540J82A7FAI7022KK6ACF9Z12720G3GC1FG3CDJ1HGILBA4BLK9GDFABD79353B235AACGL89H158314GZIB816EHF88L7F1305C23LIAEEAGECCDE497H7A853010DJGL435I55B6GZ151BD8C78BAA765B7A6D838J400GHA63A8ABH7I876626704D33GBJ5F1LZB2KD77I786ILFFE490JH56H08D8622C220JJF5DLHF5LL6J55385IA080Z4J6BJBL4A135621K8B22BL7BK3JEI62E0A4IJ20EIIK64E7D8KIA5JCFLZL2FBGJ9HH6GJK2K70E33H3K5AL8C4DCCJ1LKDE8GI1EE879C1911H6JI1Z10250A725DK9KIKL91D297F3158DBF353EADBKHDA3G37CKIH43B5F827KZLHL0GL9KL1K5JBIGEEDDBK69KKEH1KDH0AFG83HFG1D1G9AG73I02HDCLZ17BDCIF155H9IKI6FB4F0C1IHDI0GBC5B3JBKD6FFH9EFGK4CIFE1754JAZDF21D94LI8I7D23EE06EHJCAI28KC3I22BH6JFH469B97BHEAC75A015H");
	}

}