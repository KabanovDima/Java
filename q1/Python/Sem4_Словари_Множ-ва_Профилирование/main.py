import time
import random

# 25. Напишите программу, которая принимает на вход строку, и выводит 
# кол-во повторов каждого из символов 1 раз.
# №1
# #csome_str = input()
# some_str = ''.join([chr(random.randint(32,100)) for _ in range(10 ** 5)])

# start = time.perf_counter()
# for letter in set(some_str):
#     # # print(letter, some_str.count(letter))
#     a = letter, some_str.count(letter)
# end = time.perf_counter()
# duration1 = end - start

# # №2

# start = time.perf_counter()
# for letter in set(some_str):
#     amount = 0
#     for letter1 in some_str:
#         if letter == letter1:
#             amount += 1
#     # # print(letter, amount)
#     a = letter, amount
# end = time.perf_counter()
# duration2 = end - start
# print(duration2 / duration1)

# #3 не работает почемуто 

# # start = time.perf_counter()
# # count = 0
# # lens = len(some_str)
# # while lens > 0:
# #     for i in range(0, lens):
# #         if some_str[0] == some_str[i]:
# #             count += 1
# # lens -= count
# # # print(f'{some_str[0]} -> {count}')
# # a = f'{some_str[0]} -> {count}'
# # some_str = some_str.replace(some_str[0], '')
# # count = 0
# # end = time.perf_counter()
# # duration3 = end - start
# # print(duration1, duration2, duration3)

# №4 линейная сложность
    # var1
# some_string = ('A', 'A', 'B', 'C', 'C')
# print(some_string)
# count_dict = {}
# for letter in some_string:
#     if letter not in count_dict:
#         count_dict[letter] = 1
#     else:
#         count_dict[letter] += 1
# print(count_dict)


    # var2
# start = time.perf_counter()
# count_dict = {} # a:3
# for letter in some_str:
#     if letter not in count_dict:
#         count_dict[letter] = 1
#     else:
#         count_dict[letter] = count_dict[letter] + 1
# # print(count_dict)
# end = time.perf_counter()
# duration4 = end - start
# print(duration1, duration2, duration4)

# ///////////////////////////////////////////////////

# Задача №27. 
# Пользователь вводит текст(строка). Словом считается
# последовательность непробельных символов идущих
# подряд, слова разделены одним или большим числом
# пробелов. Определите, сколько различных слов
# содержится в этом тексте.
# Input: She sells sea shells on the sea shore The shells
# that she sells are sea shells I'm sure.So if she sells sea
# shells on the sea shore I'm sure that the shells are sea
# shore shells
# Output: 13

# 1. Решение со split
# some_str = input().split() #если в сплит нчего не укзаать, по умолчанию строка делится по пробелам
# print(len(set(some_str)))

# 2. Решение без split
# some_str = input()
# some_set = set()
# temp_word = ''
# for letter in some_str:
#     if letter != ' ':
#         temp_word = temp_word + letter
#     else:
#         if temp_word: # или можно так: if temp_word != '': # ввели, чтобы исключить двойной пробел
#             some_set.add(temp_word)
#         temp_word = ''
# some_set.add(temp_word)
# print(some_set, len(some_set))