def count_bits(n):
    count = 0;
    while n > 0:
        r = n%2
        if r == 1:
            count += 1
        n = int(n/2)
    return count

# def countBits(n):
#     return bin(n).count("1")