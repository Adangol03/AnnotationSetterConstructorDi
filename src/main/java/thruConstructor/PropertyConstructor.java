package thruConstructor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PropertyConstructor {
    public RentOfFlatConstructor rentOfFlatConstructor;
    public SelfOwnedFlatConstructor selfOwnedFlatConstructor;
}
