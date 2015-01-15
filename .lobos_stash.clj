
(create
 (table
  :game
  (text :id :primary-key)
  (text :name :not-null)
  (text :url :not-null :unique)
  (date :start_date)))
