package Annotation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@AllArgsConstructor
public class Property {
    private RentOfFlat rentOfFlatConstructor;
    private SelfOwnedFlat selfOwnedFlatConstructor;
}
