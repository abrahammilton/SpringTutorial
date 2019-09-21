/**
 * 
 */
package com.aby.springboot.springboottutorial;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author abrahammilton
 *
 */

@RestController
public class BookController {

	@GetMapping("/books")
	public List<Book> getBooks(){
		return Arrays.asList(new Book(1l, "The BIBLE", "HOLY SPIRIT"));
	}
}
