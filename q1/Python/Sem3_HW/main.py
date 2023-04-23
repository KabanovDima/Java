import random

# Задача 16: Требуется вычислить, сколько раз встречается 
# некоторое число X в списке A[1..N]. Пользователь в первой 
# строке вводит натуральное число N – количество элементов в 
# массиве. В последующих  строках записаны N целых чисел Ai. 
# Последняя строка содержит число X
# *Пример:*
# 5
#     1 2 3 4 5
#     3
#     -> 1

# var1
# some_list = []
# n = int(input('Введите кол-во эл.массива N: '))
# print(n)
# for _ in range(n):
#     i = int(input('Введите число: '))
#     some_list.append(i)
# print(some_list)
# x = int(input('Введиче число, кол-во которых нужно найти в списке: '))
# print(x)
# print(some_list.count(x))

# var2
# a = [int(input()) for _ in range(int(input()))]
# x = int(input('Введите искомое число: '))
# print(a.count(x))


# ===================================================================

# Задача 18: Требуется найти в списке A[1..N] самый близкий 
# по величине элемент к заданному числу X. Пользователь в первой 
# строке вводит натуральное число N – количество элементов в списке. 
# В последующих  строках записаны N целых чисел Ai. Последняя 
# строка содержит число X
# *Пример:*
# 5
#     1 2 3 4 5
#     6
#     -> 5

# var1
# some_list = []
# n = int(input('Введите кол-во элементов списка: '))
# for _ in range(n):
#     i = int(input('Введите число списка от 1 до {0}: '.format(n)))
#     some_list.append(i)
# print(some_list)
# x = int(input('Введите число ближайшее к которому будем искать: '))
# closed_num = 0
# for i in range(0, len(some_list)):
#     if x == some_list[i]:
#         closed_num = some_list[i]
#         break
#     if x < some_list[i]:
#         closed_num = min(some_list)
#     if x > some_list[i]:
#         closed_num = max(some_list)
# print(closed_num)

# var2
# rnd_list = [random.randint(-100, 100) for _ in range(10)]
# x = int(input())
# print(rnd_list)
# min_diff = abs(rnd_list[0] - x)
# for el in rnd_list:
#     if abs(el - x) < min_diff:
#         min_diff = abs(el - x)
#         find_el = el
# print(find_el)

# var3
# rnd_list = [random.randint(-100, 100) for _ in range(10)]
# x = int(input())
# print(rnd_list)
# some_set = set(rnd_list)
# diff = 0
# while True:
#     if x + diff in some_set:
#         print(x + diff)
#         break
#     elif x - diff in some_set:
#         print(x - diff)
#         break
#     diff+=1

# ===================================================================

# *Задача 20: * В настольной игре Скрабл (Scrabble) каждая буква 
# имеет определенную ценность. В случае с английским алфавитом очки 
# распределяются так:A, E, I, O, U, L, N, S, T, R – 1 очко; D, G – 2 очка; 
# B, C, M, P – 3 очка; F, H, V, W, Y – 4 очка; K – 5 очков; J, X – 8 очков; 
# Q, Z – 10 очков. А русские буквы оцениваются так: А, В, Е, И, Н, О, Р, С, Т – 1 очко; 
# Д, К, Л, М, П, У – 2 очка; Б, Г, Ё, Ь, Я – 3 очка; Й, Ы – 4 очка; 
# Ж, З, Х, Ц, Ч – 5 очков; Ш, Э, Ю – 8 очков; Ф, Щ, Ъ – 10 очков. 
# Напишите программу, которая вычисляет стоимость введенного пользователем слова. 
# Будем считать, что на вход подается только одно слово, которое содержит либо 
# только английские, либо только русские буквы.
# *Пример:*
# ноутбук
#     12

# dictionary = {
# 'A': 1, 'E': 1, 'I': 1, 'O': 1, 'U': 1, 'L': 1, 'N': 1, 'S': 1, 'T': 1, 'R': 1,
# 'D': 2, 'G': 2,
# 'B': 3, 'C': 3, 'M': 3, 'P': 3,
# 'F': 4, 'H': 4, 'V': 4, 'W': 4, 'Y': 4,
# 'K': 5,
# 'J': 8, 'X': 8,
# 'Q': 10, 'Z': 10
# }
# summa = 0
# for letter in input().upper:
#     summa += dictionary[letter]
# print(summa)