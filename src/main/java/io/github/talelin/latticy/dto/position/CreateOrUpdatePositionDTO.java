package io.github.talelin.latticy.dto.position;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

/**
 * @author 陈灿杰
 * @since 2021-04-10
 */
@Data
@NoArgsConstructor
public class CreateOrUpdatePositionDTO {

    @NotEmpty(message = "{position.title.not-empty}")
    private String title;

    @NotEmpty(message = "{position.requirement.not-empty}")
    private String requirement;

    private Integer quantity;

    private String city;

    private Integer salaryUp;

    private Integer salaryDown;

    private Integer categoryId;

    private Integer hrId;

    private Integer companyId;
}
