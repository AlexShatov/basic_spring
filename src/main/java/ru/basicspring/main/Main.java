package ru.basicspring.main;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ru.basicspring.beans.Config;
import ru.basicspring.beans.Something;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = null;
		try {
			context = new AnnotationConfigApplicationContext(Config.class);
			System.out.println("Something is defined = " + context.containsBeanDefinition("something"));
			System.out.println("InnerSomething is defined = " + context.containsBeanDefinition("inner_something"));
			Something something = (Something) context.getBean("something");
			System.out.println(something.getWhatInside());
			System.in.read();
		}
		catch(BeansException | IOException e) {
			e.printStackTrace();
		}
		finally {
			if(context != null) {
				context.close();
			}
		}
	}
}
