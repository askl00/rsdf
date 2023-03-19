package com.lmy.rsck.view.dto;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 游戏词条表(RsdfGameEntry)Dto
 *
 * @author makejava
 * @since 2023-03-19 21:00:04
 */
@Data
@Accessors(chain = true)
public class RsdfGameEntryDto implements Serializable {
    private static final long serialVersionUID = 533704245302612196L;
    
        private Long id;

        /**
     * 游戏id
     */
    private Long gameId;

        /**
     * 目标id
     */
    private Long entryId;

}