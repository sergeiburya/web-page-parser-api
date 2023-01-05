--liquibase formatted sql
--changeset <serge>:<add-external-id-column-movie-character-table>

ALTER TABLE public.movie_character ADD external_id bigint;

--rollback ALTER TABLE DROP COLUMN external_id;