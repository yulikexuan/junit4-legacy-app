package guru.springframework;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@Tag("IT")
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Spring5RecipeAppApplicationIT {

	@Test
	public void contextLoads() {
	}

}///:~