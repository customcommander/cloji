(ns charlotte.purple)

(def loulou {\a "🐈"
             \b "😎"
             \c "👨🏼‍🌾"
             \d "🧚🏻‍♀️"
             \e "👯‍♀️"
             \f "🌝"
             \g "😴"
             \h "🐘"
             \i "✊🏾"
             \j "🍁"
             \k "🍬"
             \l "🧘🏼‍♀️"
             \m "👩🏾‍🚀"
             \n "🐒"
             \o "🐣"
             \p "❤️"
             \q "🤓"
             \r "🏃🏼‍♀️"
             \s "🦎"
             \t "🍀"
             \u "⭐️"
             \v "🐿"
             \w "🥏"
             \x "🚤"
             \y "🌅"
             \z "🏳️‍🌈"})

(defn miawmiaw [teddy]
  (apply str (map loulou teddy)))
