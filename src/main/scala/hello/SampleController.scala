package hello

import org.springframework.boot._
import org.springframework.boot.autoconfigure._
import org.springframework.stereotype._
import org.springframework.web.bind.annotation._
import SampleController._
object SampleController {
def main(args: Array[String]) {
    SpringApplication.run(classOf[SampleController])
  }
}
@Controller
@EnableAutoConfiguration
class SampleController {
@RequestMapping(Array("/"))
@ResponseBody
def home(): String = "Hello World!!!!"
}
