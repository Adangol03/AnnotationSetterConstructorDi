package Annotation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
@AllArgsConstructor
public class RentOfFlat {
    private RentOfOneBHKFlat rentOfOneBHKFlat;
    private RentOfTwoBHKFlat rentOfTwoBHKFlat;
    private RentOfThreeBHKFlat rentOfThreeBHKFlat;
}
