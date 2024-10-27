package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ProductRepository;

@SpringBootApplication
public class NimapCommApplication {

	 @Autowired
	    private CategoryRepository categoryRepository;

	    @Autowired
	    private ProductRepository productRepository;
	public static void main(String[] args) {
		SpringApplication.run(NimapCommApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		
//		
//		Category electronics = new Category("Electronics");
//        Category clothing = new Category("Clothing");
//        Category diwali = new Category("Diwali");
//        categoryRepository.save(electronics);
//        categoryRepository.save(clothing);
//        categoryRepository.save(diwali);
//
//        // Add sample products
//     // Add more electronic products
//        productRepository.save(new Product("Smartphone", 699.99, electronics));
//        productRepository.save(new Product("Laptop", 999.99, electronics));
//        productRepository.save(new Product("Smartwatch", 199.99, electronics));
//        productRepository.save(new Product("Bluetooth Headphones", 89.99, electronics));
//        productRepository.save(new Product("4K Ultra HD TV", 1299.99, electronics));
//        productRepository.save(new Product("Wireless Earbuds", 59.99, electronics));
//        productRepository.save(new Product("Tablet", 399.99, electronics));
//        productRepository.save(new Product("Gaming Console", 499.99, electronics));
//        productRepository.save(new Product("Digital Camera", 749.99, electronics));
//        productRepository.save(new Product("Fitness Tracker", 49.99, electronics));
//        productRepository.save(new Product("External Hard Drive", 99.99, electronics));
//        productRepository.save(new Product("Smart Home Assistant", 129.99, electronics));
//        productRepository.save(new Product("VR Headset", 299.99, electronics));
//        productRepository.save(new Product("Portable Bluetooth Speaker", 79.99, electronics));
//        productRepository.save(new Product("Laptop Stand", 29.99, electronics));
//        productRepository.save(new Product("USB-C Hub", 39.99, electronics));
//        productRepository.save(new Product("Game Controller", 59.99, electronics));
//
//     // Add more clothing products
//        productRepository.save(new Product("T-Shirt", 19.99, clothing));
//        productRepository.save(new Product("Jeans", 39.99, clothing));
//        productRepository.save(new Product("Summer Dress", 29.99, clothing));
//        productRepository.save(new Product("Hoodie", 49.99, clothing));
//        productRepository.save(new Product("Jacket", 89.99, clothing));
//        productRepository.save(new Product("Sweater", 34.99, clothing));
//        productRepository.save(new Product("Skirt", 24.99, clothing));
//        productRepository.save(new Product("Shorts", 19.99, clothing));
//        productRepository.save(new Product("Formal Shirt", 49.99, clothing));
//        productRepository.save(new Product("Casual Shoes", 59.99, clothing));
//        productRepository.save(new Product("Sports Shoes", 69.99, clothing));
//        productRepository.save(new Product("Cap", 14.99, clothing));
//        productRepository.save(new Product("Socks", 5.99, clothing));
//        productRepository.save(new Product("Belt", 19.99, clothing));
//        productRepository.save(new Product("Scarf", 12.99, clothing));
//        productRepository.save(new Product("Activewear Leggings", 29.99, clothing));
//
//     // Add sample Diwali products
//        
//        productRepository.save(new Product("Diya Set (Pack of 10)", 15.99, diwali));
//        productRepository.save(new Product("Rangoli Colors Set", 12.99, diwali));
//        productRepository.save(new Product("Decorative Lantern", 19.99, diwali));
//        productRepository.save(new Product("Traditional Sweets Box", 24.99, diwali));
//        productRepository.save(new Product("Puja Thali Set", 29.99, diwali));
//        productRepository.save(new Product("Laxmi Ganesh Idol", 39.99, diwali));
//        productRepository.save(new Product("Sparkler Pack", 5.99, diwali));
//        productRepository.save(new Product("LED String Lights", 15.99, diwali));
//        productRepository.save(new Product("Gift Hamper (Diwali Special)", 49.99, diwali));
//        productRepository.save(new Product("Candles (Pack of 12)", 9.99, diwali));
//        productRepository.save(new Product("Traditional Clothing (Kurta)", 34.99, diwali));
//        productRepository.save(new Product("Festive Greeting Cards (Pack of 5)", 6.99, diwali));
//        productRepository.save(new Product("Scented Candles Set", 19.99, diwali));
//        productRepository.save(new Product("Chocolate Box", 14.99, diwali));
//        productRepository.save(new Product("Diwali Decorative Wall Hanging", 25.99, diwali));

		
	}


