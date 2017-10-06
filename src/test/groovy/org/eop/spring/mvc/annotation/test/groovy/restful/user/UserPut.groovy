package org.eop.spring.mvc.annotation.test.groovy.restful.user

import org.eop.spring.mvc.annotation.test.java.restful.AbstractPutTest

class UserPut extends AbstractPutTest {

	@Override
	String getRestUri() {
		'/user/put'
	}

	@Override
	Map<String, Object> getUriVars() {
		[:]
	}

	@Override
	Map<String, Object> getHttpHeaders() {
		['Content-Type':'application/json','Accept':'application/json']
	}

	@Override
	<T> T getRequestBody() {
		["id":1010,"userName":"李新杰","password":"000000","registerTime":"2017-09-11 18:06:58"]
	}

}
