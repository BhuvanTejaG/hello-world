package hello

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.bind.annotation.{RequestMapping, RestController}
import org.springframework.boot._;
import org.springframework.boot.autoconfigure._;
import org.springframework.web.bind.annotation._;
@RestController
@EnableAutoConfiguration
@ComponentScan
class HelloWorld {

 @RequestMapping(value=Array("/"), method=Array(RequestMethod.GET))
 def newresponse() = "Hello world.. I'm Bhuvan Teja Guddanti...This is my first scala program!!"


}

object HelloWorldApplication{

    def main(args: Array[String]) {
    SpringApplication.run(classOf[HelloWorld]);
        }
}




