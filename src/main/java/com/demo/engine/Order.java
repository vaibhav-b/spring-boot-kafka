package com.demo.engine;


import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
    double no;
    String name;
}
