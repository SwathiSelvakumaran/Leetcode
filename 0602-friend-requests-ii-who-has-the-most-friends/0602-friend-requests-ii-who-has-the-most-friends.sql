WITH AllFriends AS (
    SELECT requester_id AS id, accepter_id AS friend_id
    FROM RequestAccepted
    UNION ALL
    SELECT accepter_id AS id, requester_id AS friend_id
    FROM RequestAccepted
),
FriendCounts AS (
    SELECT id, COUNT(friend_id) AS num
    FROM AllFriends
    GROUP BY id
),
MaxFriendCount AS (
    SELECT id, MAX(num) AS max_num
    FROM FriendCounts
    GROUP BY id
)
SELECT id, max_num AS num
FROM MaxFriendCount
WHERE max_num = (SELECT MAX(max_num) FROM MaxFriendCount);
