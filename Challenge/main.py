import sys


def power_of_four_sum(numbers):
    # Sum Yn^4, but only for the values that aren't positive.
    negatives_and_zero = filter(lambda y: y <= 0, numbers)
    return sum(map(lambda y: y ** 4, negatives_and_zero))


def handle_case(countline, valueline):
    expected = int(countline)
    numbers = list(map(int, valueline.split()))

    # If promised amount of numbers doesn't match, bail -1.
    if len(numbers) != expected:
        return "-1"

    return str(power_of_four_sum(numbers))


def run(lines, case, total, answers):
    if case > total:
        return answers

    countline = lines[case * 2 - 1]
    valueline = lines[case * 2]
    answers.append(handle_case(countline, valueline))

    return run(lines, case + 1, total, answers)


def main():
    lines = sys.stdin.read().splitlines()
    total = int(lines[0])
    answers = run(lines, 1, total, [])
    print("\n".join(answers))


if __name__ == "__main__":
    main()
