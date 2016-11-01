ALTER TABLE tag_table  ADD  blogpost_id bigint

ALTER TABLE blogpost  ADD  tag_id bigint

ALTER TABLE tag_table  WITH CHECK ADD  CONSTRAINT FK_BLOGPOST FOREIGN KEY(blogpost_id)
REFERENCES blogpost (id)

ALTER TABLE blogpost  WITH CHECK ADD  CONSTRAINT FK_TAG FOREIGN KEY(tag_id)
REFERENCES tag_table (id)