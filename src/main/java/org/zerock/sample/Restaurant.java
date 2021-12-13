package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 의존성 주입 방법
// 1. Setter 주입
// 2. 생성자 주입
// 3. 필드 주입

@Component
@ToString
@RequiredArgsConstructor
public class Restaurant {

	private final Chef chef;
	
}
