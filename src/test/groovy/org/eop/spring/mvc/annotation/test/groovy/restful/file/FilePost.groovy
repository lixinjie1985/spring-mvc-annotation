package org.eop.spring.mvc.annotation.test.groovy.restful.file

import org.eop.spring.mvc.annotation.test.java.restful.AbstractPostTest
import org.springframework.core.io.FileSystemResource
import org.springframework.util.LinkedMultiValueMap
import org.springframework.util.MultiValueMap

class FilePost extends AbstractPostTest {

	@Override
	String getRestUri() {
		'/file/post'
	}

	@Override
	Map<String, Object> getUriVars() {
		[:]
	}

	@Override
	Map<String, Object> getHttpHeaders() {
		['Content-Type':'multipart/form-data','Accept':'application/json']
	}

	@Override
	<T> T getRequestBody() {
		MultiValueMap<String, Object> body = new LinkedMultiValueMap<>()
		FileSystemResource fsr = new FileSystemResource(new File('C:\\Users\\Administrator\\Desktop\\json.txt'))
		body.add('name', '中文')
		body.add('file', fsr)
		body
	}

}
