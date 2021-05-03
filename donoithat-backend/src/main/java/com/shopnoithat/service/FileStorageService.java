package com.shopnoithat.service;
import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.shopnoithat.entity.Category;
import com.shopnoithat.entity.Product;
import com.shopnoithat.entity.Supplier;
import com.shopnoithat.repository.FileDBRepository;



@Service
public class FileStorageService {
	@Autowired
	private FileDBRepository fileDBRepository;
	
	public Product save(
			String title,
			int count,
			double price,
			MultipartFile thumbnail,String content,
			Category category,
			Supplier supplier
			
			) throws IOException{
		Product p = new Product();
		
		
		p.setTitle(title);
		p.setCount(count);
		p.setPrice(price);
		try {
			p.setThumbnail(Base64.getEncoder().encodeToString(thumbnail.getBytes()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		p.setContent(content);
		
		p.setCategory(category);
		p.setSupplier(supplier);
	
	return	fileDBRepository.save(p);
	}
	
	public List<Product> findAll(){
		return fileDBRepository.findAll();
	}
	
	public List<Product> getProductByCategory(Category category){
		
		
		return fileDBRepository.findByCategory(category);
		
	}
	
	public Product findById(Long id) {
		Optional<Product> optional = fileDBRepository.findById(id);
		Product product = null;
		if (optional.isPresent()) {
            product = optional.get();
        } else {
            throw new RuntimeException(" product not found for id :: " + id);
        }
		return product;
	}
}
