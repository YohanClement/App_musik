use bd_music_project;
ALTER TABLE MusicInstruments MODIFY Instr_type INT DEFAULT null;

ALTER TABLE `bd_music_project`.`musicinstruments` 
CHANGE COLUMN `Instr_type` `Instr_type` VARCHAR(500) NULL DEFAULT NULL ;


ALTER TABLE `bd_music_project`.`musicinstruments` 
ADD UNIQUE INDEX `Instr_name_UNIQUE` (`Instr_name` ASC) VISIBLE;
;

-- j'avais mis not null au genre parent 
ALTER TABLE `bd_music_project`.`genre_music` 
DROP FOREIGN KEY `genre_music_ibfk_1`;
ALTER TABLE `bd_music_project`.`genre_music` 
CHANGE COLUMN `Genre_parent` `Genre_parent` INT(11) NULL ;
ALTER TABLE `bd_music_project`.`genre_music` 
ADD CONSTRAINT `genre_music_ibfk_1`
  FOREIGN KEY (`Genre_parent`)
  REFERENCES `bd_music_project`.`genre_music` (`Genre_id`);





ALTER TABLE `bd_music_project`.`groupe` 
DROP FOREIGN KEY `groupe_ibfk_1`;
ALTER TABLE `bd_music_project`.`groupe` 
CHANGE COLUMN `Creator_id` `Creator_id` INT(11) NULL ;

ALTER TABLE `bd_music_project`.`groupe` 
ADD CONSTRAINT `groupe_ibfk_1`
  FOREIGN KEY (`Creator_id`)
  REFERENCES `bd_music_project`.`users` (`Users_id`);
  
  -- je rends la foreign key creator id nullable 
-- photos de profils a ajouter et tout ce qui est colonne automatique 


ALTER TABLE `bd_music_project`.`users` 
ADD COLUMN `Password` VARCHAR(45) NOT NULL DEFAULT 'Abc123!' AFTER `Users_id`;


ALTER TABLE `bd_music_project`.`genre_music` 
ADD UNIQUE INDEX `Genre_name_UNIQUE` (`Genre_name` ASC) VISIBLE;
;


ALTER TABLE `bd_music_project`.`users` 
CHANGE COLUMN `Password` `Password` VARCHAR(200) NOT NULL DEFAULT 'Abc123!' ;


UPDATE `bd_music_project`.`users` SET `Password` = '$2a$10$WTxadg99cAUOo2GmjGcZgeV/pH92bsjcZFpuwZ5QxHRtPr3YHvZQq' WHERE (`Users_id` = '1');
UPDATE `bd_music_project`.`users` SET `Password` = '$2a$10$WTxadg99cAUOo2GmjGcZgeV/pH92bsjcZFpuwZ5QxHRtPr3YHvZQq' WHERE (`Users_id` = '2');
UPDATE `bd_music_project`.`users` SET `Password` = '$2a$10$WTxadg99cAUOo2GmjGcZgeV/pH92bsjcZFpuwZ5QxHRtPr3YHvZQq' WHERE (`Users_id` = '3');
