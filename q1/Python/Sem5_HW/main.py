# Задача 26:
# Напишите программу, которая на вход принимает два числа A и B, 
# и возводит число А в целую степень B с помощью рекурсии.
# *Пример:*
# A = 3; B = 5 -> 243 (3⁵)
#     A = 2; B = 3 -> 8 

# a = int(input('Введите число:'))
# b = int(input('Введите степень, в котрую нужно возвести число:'))

# def degree_number(a, b):
#     if b == 1:
#         return a
#     else:
#         return a * degree_number(a, b - 1)
# print(degree_number(a, b))

# ===============================================================================
# ===============================================================================

# Дана строка (возможно, пустая), состоящая из букв A-Z:
# AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB
# Нужно написать функцию RLE, которая на выходе даст строку
# вида:
# A4B3C2XYZD4E3F3A6B28

some_string = ('AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBBC')
# print(some_string)
some_list = list(some_string)
print(some_list)
temp_list = []
final_list = []
for i in range(0, len(some_list) - 1):
    # print(some_list[i], end=' ')
    if some_list[i] == some_list[i+1]:
        temp_list.append(some_list[i])
    else:
        temp_list.append(some_list[i])
        final_list.append(temp_list)
        temp_list = []
if temp_list:
    final_list.append(temp_list)
if some_list[-1] == some_list[-2]:
    final_list[-1].append(some_list[-1])
else:
    final_list.append(some_list[-1])
print(final_list)
print_list = []
for i in final_list:
    if len(i) > 1:
        print_list.append(f'{i[0]}{len(i)}')
    else:
        print_list.append(i[0])
print(*print_list, sep='')