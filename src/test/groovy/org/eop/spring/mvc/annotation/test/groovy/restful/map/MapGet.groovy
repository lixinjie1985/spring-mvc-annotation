package org.eop.spring.mvc.annotation.test.groovy.restful.map

import org.eop.spring.mvc.annotation.test.java.restful.AbstractGetTest

class MapGet extends AbstractGetTest {

	@Override
	String getRestUri() {
		'/map/get'
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
		null
	}

}
