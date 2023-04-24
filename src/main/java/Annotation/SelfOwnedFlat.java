package Annotation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@AllArgsConstructor
public class SelfOwnedFlat {
    private SelfOwnerOneBHKFlat selfOwnerOneBHKFlat;
    private SelfOwnerTwoBHKFlat selfOwnerTwoBHKFlat;
    private SelfOwnerThreeBHKFlat selfOwnerThreeBHKFlat;

}
