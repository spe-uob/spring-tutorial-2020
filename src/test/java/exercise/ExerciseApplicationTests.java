package exercise;

import exercise.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExerciseApplicationTests {

	@Autowired
	HelloController helloController;

	@Test
	void contextLoads() {
	}

	@Test
	void addTest() {
		assert(!helloController.addName(null));
		assert(helloController.addName("test"));
		assert(helloController.names.contains("test"));
	}

}
