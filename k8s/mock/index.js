const express = require("express");
const fs = require("fs");

const app = express();
console.log(" express();", new Date());
const port = 3000;

app.get("/", (req, res) => {
  res.send({});
});

app.post("/auth", (req, res) => {
  console.log("/auth", new Date());
  let randomNumber = Math.random().toString();
  randomNumber = randomNumber.substring(2, randomNumber.length);
  res.cookie("cookieName", randomNumber, { maxAge: 900000, httpOnly: true });

  res.send({
    response: {
      status: "OK",
      token: "authn:278320:d295a17fc5173:ams1",
      dbg_info: {
        instance: "authentication-api-production-bf5c7d6bd-4bhwz",
        time: 445,
        start_time: "2021-06-07T14:46:00.887Z",
        version: "0.0.0",
      },
    },
  });
});

app.post("/uploadURL", (req, res) => {
  console.log("/uploadURL", new Date());
  res.send({
    response: {
      status: "OK",
      count: 0,
      id: 246405405,
      start_element: 0,
      num_elements: 100,
      batch_segment_upload_job: {
        id: 246405405,
        job_id: "1ybpJZgMTg62xEVR9NIR72qhiO5nif1623079995",
        member_id: 12939,
        last_modified: "2021-06-07 15:33:15",
        upload_url: "http://localhost:4440/upload",
      },
      dbg_info: {
        warnings: [],
        version: "2.0.276",
        output_term: "batch_segment_upload_job",
      },
    },
  });
});

app.post("/registerSegment", (req, res) => {
  console.log("/registerSegment", new Date());
  res.send({
    response: {
      id: 102,
      count: 1,
      dbg_info: {
        output_term: "segment",
        slave_hit: false,
        version: "2.0.133",
        warnings: [],
      },
      start_element: 0,
      num_elements: 100,
      segment: {
        object_type: "default",
        advertiser_id: null,
        enable_rm_piggyback: true,
        querystring_mapping_key_value: null,
        member_id: 25,
        expire_minutes: null,
        category: null,
        provider: null,
        parent_segment_id: null,
        querystring_mapping: null,
        short_name: "yuichi-test",
        max_usersync_pixels: null,
        code: "yuichi-test-seg-02",
        state: "active",
        description: null,
        id: 102,
        piggyback_pixels: null,
        last_modified: "2019-08-14 17:26:29",
      },
      status: "OK",
    },
  });
});

app.get("/getJobs", (req, res) => {
  console.log("/getJobs", new Date());
  res.send({
    response: {
      status: "OK",
      start_element: 0,
      num_elements: 100,
      batch_segment_upload_job: [
        {
          phase: "starting",
          start_time: null,
          uploaded_time: null,
          validated_time: null,
          completed_time: null,
          error_code: null,
          time_to_process: "0.00",
          percent_complete: 0,
          num_valid: 0,
          num_invalid_format: 0,
          num_valid_user: 0,
          num_invalid_user: 0,
          num_invalid_segment: 0,
          num_invalid_timestamp: 0,
          num_unauth_segment: 0,
          num_past_expiration: 0,
          num_inactive_segment: 0,
          num_other_error: 0,
          error_log_lines: null,
          segment_log_lines: null,
          id: 246405405,
          job_id: "1ybpJZgMTg62xEVR9NIR72qhiO5nif1623079995",
          member_id: 12939,
          created_on: "2021-06-07 15:33:15",
          last_modified: "2021-06-07 15:33:15",
        },
        {
          phase: "starting",
          start_time: null,
          uploaded_time: null,
          validated_time: null,
          completed_time: null,
          error_code: null,
          time_to_process: "0.00",
          percent_complete: 0,
          num_valid: 0,
          num_invalid_format: 0,
          num_valid_user: 0,
          num_invalid_user: 0,
          num_invalid_segment: 0,
          num_invalid_timestamp: 0,
          num_unauth_segment: 0,
          num_past_expiration: 0,
          num_inactive_segment: 0,
          num_other_error: 0,
          error_log_lines: null,
          segment_log_lines: null,
          id: 246409504,
          job_id: "TKp8y65qnXxhRCHxUtHX4qfihOkxPn1623083174",
          member_id: 12939,
          created_on: "2021-06-07 16:26:14",
          last_modified: "2021-06-07 16:26:14",
        },
        {
          phase: "starting",
          start_time: null,
          uploaded_time: null,
          validated_time: null,
          completed_time: null,
          error_code: null,
          time_to_process: "0.00",
          percent_complete: 0,
          num_valid: 0,
          num_invalid_format: 0,
          num_valid_user: 0,
          num_invalid_user: 0,
          num_invalid_segment: 0,
          num_invalid_timestamp: 0,
          num_unauth_segment: 0,
          num_past_expiration: 0,
          num_inactive_segment: 0,
          num_other_error: 0,
          error_log_lines: null,
          segment_log_lines: null,
          id: 245826660,
          job_id: "O83iTagEDmLnDZgVTN8hJQmLxM2vOg1622694888",
          member_id: 12939,
          created_on: "2021-06-03 04:34:49",
          last_modified: "2021-06-03 04:34:49",
        },
        {
          phase: "starting",
          start_time: null,
          uploaded_time: null,
          validated_time: null,
          completed_time: null,
          error_code: null,
          time_to_process: "0.00",
          percent_complete: 0,
          num_valid: 0,
          num_invalid_format: 0,
          num_valid_user: 0,
          num_invalid_user: 0,
          num_invalid_segment: 0,
          num_invalid_timestamp: 0,
          num_unauth_segment: 0,
          num_past_expiration: 0,
          num_inactive_segment: 0,
          num_other_error: 0,
          error_log_lines: null,
          segment_log_lines: null,
          id: 245826673,
          job_id: "IlIUqzlA0jlRkqaUSUT0bs4w18pRxs1622694899",
          member_id: 12939,
          created_on: "2021-06-03 04:34:59",
          last_modified: "2021-06-03 04:34:59",
        },
      ],
      count: 4,
      dbg_info: {
        warnings: [],
        version: "2.0.276",
        output_term: "batch_segment_upload_job",
      },
    },
  });
});

app.get("/viewSegments", (req, res) => {
  console.log("/viewSegments", new Date());
  let randomNumber = Math.random().toString();
  randomNumber = randomNumber.substring(2, randomNumber.length);
  res.cookie("cookieName", randomNumber, { maxAge: 900000, httpOnly: true });

  console.log("__dirname", __dirname);

  const obj = JSON.parse(
    fs.readFileSync("/Users/shubhamjain/Downloads/res.json", "utf8")
  );

  res.send(obj);
});

app.post("/upload", (req, res) => {
  console.log("/upload", new Date());

  console.log(req);

  res.send({
    response: {
      segment_upload: { job_id: "aJPyL0NG4Owqxr7RVyS4LxQ8GuW7pW1623125353" },
      status: "OK",
    },
  });
});

app.listen(port, () => {
  console.log("ort,", new Date());
  console.log(`Example app listening at http://localhost:${port}`);
  console.log("Example app", new Date());
});
