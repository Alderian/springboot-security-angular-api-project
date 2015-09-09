package demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class ResourceApplication {

	/**
	 * This is a useful trick in a Spring Security application. If the "/user"
	 * resource is reachable then it will return the currently authenticated
	 * user (an Authentication), and otherwise Spring Security will intercept
	 * the request and send a 401 response through an
	 * {@link AuthenticationEntryPoint}}.
	 * 
	 * @return
	 */
	@RequestMapping('/')
	def home() {
		[id: UUID.randomUUID().toString(), content: 'Hello World']
	}

    static void main(String[] args) {
        SpringApplication.run ResourceApplication, args
    }

}
